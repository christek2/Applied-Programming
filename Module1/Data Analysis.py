import os
import math
import pandas as pd
from tkinter import *

df = pd.read_csv("Data Files/pokemon_data.csv", usecols= ["pokedex_number", "name", "height_m", "weight_kg", "percentage_male"])
df["BMI"] = round((df["weight_kg"] / df["height_m"]**2), 1)

count = 0
total_bmi = 0
for object in df.iterrows():
    count = count + 1
    if math.isnan(object[1][5]) == False:
        total_bmi = total_bmi + float(object[1][5])
average_bmi = total_bmi / count

ds = pd.read_csv("Data Files/pokemon_data.csv", usecols= ["name", "attack", "hp"])

# print(df)
os.system('CLS')
print(df.sort_values("BMI", ascending= False).head(50))
print()
print(f"Average BMI: {round(average_bmi, 1)}")


# root = Tk()
# label = Label(root, text= df)
# label.pack()
# root.mainloop()