import pandas as pd
from tkinter import *

df = pd.read_csv("Data Files/pokemon_data.csv", usecols= ["pokedex_number", "name", "height_m", "weight_kg"])
df["BMI"] = round((df["weight_kg"] / df["height_m"]**2), 1)


ds = pd.read_csv("Data Files/pokemon_data.csv", usecols= ["pokedex_number", "name", "attack", "hp"])

# print(df)
print(df.sort_values("BMI", ascending= False).head(25))


# root = Tk()
# label = Label(root, text= df)
# label.pack()
# root.mainloop()