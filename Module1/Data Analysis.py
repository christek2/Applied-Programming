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


ds = pd.read_csv("Data Files/pokemon_data.csv", usecols= ["name", "attack", "defense"])
ds["Att/Def Ratio"] = round(ds["attack"] / ds["defense"], 1)

ratio_count = 0
ratio_total = 0
for obj_ratio in ds.iterrows():
    ratio_total = ratio_total + float(obj_ratio[1][3])
    ratio_count = ratio_count + 1
ratio_avg = round(ratio_total / ratio_count, 1)

# find the percent above, at, and below avg

def ratio_analysis():
    print()
    print('Top 10 Pokemon Ranked by Their Attack To Defense Ratio (First 7 Generations):')
    print()
    print(ds.sort_values("Att/Def Ratio", ascending = False).head(20))
    print()
    print()

# bmi_analysis()
ratio_analysis()