import os
import math
import pandas as pd
from tkinter import *

df = pd.read_csv("Data Files/pokemon_data.csv", usecols= ["name", "height_m", "weight_kg"])
df["BMI"] = round((df["weight_kg"] / df["height_m"]**2), 1)

count = 0
total_bmi = 0
for object in df.iterrows():
    count = count + 1
    if math.isnan(object[1][3]) == False:
        total_bmi = total_bmi + float(object[1][3])
average_bmi = total_bmi / count

undetermined_count = 0
underweight_count = 0
healthy_count = 0
overweight_count = 0
obese_count = 0
severely_obese_count = 0
for object_2 in df.iterrows():
    if math.isnan(object_2[1][3]) == False:
        bmi = float(object_2[1][3])
        if bmi < 18.5:
            underweight_count = underweight_count + 1
        elif bmi >= 18.5 and bmi < 25:
            healthy_count = healthy_count + 1
        elif bmi >= 25 and bmi < 30:
            overweight_count = overweight_count + 1
        elif bmi >= 30 and bmi < 40:
            obese_count = obese_count + 1
        elif bmi >= 40:
            severely_obese_count = severely_obese_count + 1
    else:
        undetermined_count = undetermined_count + 1

total_count = underweight_count + healthy_count + overweight_count + obese_count + severely_obese_count + undetermined_count
under_percent = underweight_count / total_count * 100
health_percent = healthy_count / total_count * 100
over_percent = overweight_count / total_count * 100
obese_percent = obese_count / total_count * 100
sev_obese_pct = severely_obese_count / total_count * 100
undet_percent = undetermined_count / total_count * 100

above_avg = 0
for object_3 in df.iterrows():
    if math.isnan(object_3[1][3]) == False:
        if float(object_3[1][3]) > average_bmi:
            above_avg = above_avg + 1


def bmi_analysis():
    os.system('CLS')
    print("Top 20 Pokemon Ranked by Their BMI (First 7 Generations):")
    print()
    print(df.sort_values("BMI", ascending= False).head(20))
    print()
    print(f"Average BMI: {round(average_bmi, 1)}")
    print(f'{round(above_avg/total_count, 2)*100}% of pokemon listed are above the average BMI ({above_avg} pokemon)')
    print(f'Half of the total weight from the combined {total_count} pokemon comes from only {round(above_avg/total_count, 2)*100}% and the other half comes from the other {100-(round(above_avg/total_count, 2)*100)}%.')
    print()
    print(f'{round(under_percent, 2)}% underweight ({underweight_count} pokemon)')
    print(f'{round(health_percent, 2)}% healthy ({healthy_count} pokemon)')
    print(f'{round(over_percent, 2)}% overweight ({overweight_count} pokemon)')
    print(f'{round(obese_percent, 2)}% obese ({obese_count} pokemon)')
    print(f'{round(sev_obese_pct, 2)}% severely obese ({severely_obese_count} pokemon)')
    print(f'{round(undet_percent, 2)}% could not be determined due to lack of data ({undetermined_count} pokemon)')
    print()


ds = pd.read_csv("Data Files/pokemon_data.csv", usecols= ["name", "type1", "attack", "defense"])
ds["att/def ratio"] = round(ds["attack"] / ds["defense"], 1)

ratio_count = 0
ratio_total = 0
for obj_ratio in ds.iterrows():
    ratio_total = ratio_total + float(obj_ratio[1][4])
    ratio_count = ratio_count + 1
ratio_avg = round(ratio_total / ratio_count, 1)

above_ratio = 0
at_ratio = 0
under_ratio = 0
for rat in ds.iterrows():
    rat = float(rat[1][4])
    if rat > ratio_avg:
        above_ratio = above_ratio + 1
    elif rat == ratio_avg:
        at_ratio = at_ratio + 1
    elif rat < ratio_avg:
        under_ratio = under_ratio + 1

rock_count = 0
rock_total = 0
bug_count = 0
bug_total = 0
for obj_type in ds.iterrows():
    type1 = str(obj_type[1][1])
    ratio_obj = float(obj_type[1][4])
    if type1 == "rock":
        rock_count = rock_count + 1
        rock_total = rock_total + ratio_obj
    elif type1 == "bug":
        bug_count = bug_count + 1
        bug_total = bug_total + ratio_obj
rock_avg = rock_total / rock_count
bug_avg = bug_total / bug_count

type_list = []
for item in ds.iterrows():
    if item[1][1] not in type_list:
        type_list.append(str(item[1][1]))

type_ratio_list = []
type_count = 0
type_ratio_total = 0
type_list = sorted(type_list)
for i in type_list:
    for type in ds.iterrows():
        if type[1][1] == i:
            type_count = type_count + 1
            type_ratio_total = type_ratio_total + float(type[1][4])
    type_ratio = round(type_ratio_total / type_count, 1)
    type_ratio_list.append(f"{type_ratio} - {i}")
    type_count = 0
    type_ratio_total = 0

def ratio_analysis():
    os.system('CLS')
    print('Top 10 Pokemon Ranked by Their Attack To Defense Ratio (First 7 Generations):')
    print()
    print(ds.sort_values("att/def ratio", ascending = False).head(10))
    print()
    print(f'The average attack to defense ratio is {ratio_avg}. {round(above_ratio / ratio_count * 100, 2)}% ({above_ratio}) are above average and {round(under_ratio / ratio_count * 100, 2)}% ({under_ratio}) are under average, while only {round(at_ratio / ratio_count * 100, 2)}% ({at_ratio}) are at the average. ')
    print()
    print(f"Common types in these highest att/def ratios are rock(3) and bug(2), but both have an average ratio of {round(rock_avg, 1)} across their respective types.")
    print()
    print("Here are the average att/def ratios across type:")
    for j in sorted(type_ratio_list, reverse= True):
        print(j)
    print()
    print("Since this metric measures the ratio of attack points to defense points, it is no surprise that the fighting type has the highest average ratio (they are geared more towards attacks) and that steel has the lowest (geared more towards defense).")
    print()

dt = pd.read_csv("Data Files/pokemon_data.csv", usecols= ["name", "percentage_male", "is_legendary", "generation"])

def legendary_analysis():
    os.system('CLS')
    print(dt[dt["is_legendary"] == 1].sort_values("percentage_male", ascending= False))

# bmi_analysis()
# ratio_analysis()
legendary_analysis()