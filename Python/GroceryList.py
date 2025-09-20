Grocery = ["Milk", "Bread", "Butter", "Jam", "Bun"]

for item in Grocery:
    print(item, end = "\n")

new_item = input("Enter the new item name to add in the grocery list: ")
Grocery.append(new_item)

r_item = input("Enter the item to remove from the grocery list: ")
if r_item in Grocery:
    Grocery.remove(r_item)
else:
    print(f"The item {r_item} is not available in the grocery list")

print(
    "The Final Grocery List is: ",
    Grocery
)