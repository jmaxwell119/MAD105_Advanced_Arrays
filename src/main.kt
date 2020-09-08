fun main(){
    var aIngredientsArray = arrayOf("ice cream", "sprinkles", "chocolate syrup", "whipped cream", "maraschino cherries", "banana", "walnuts")
    var aInventoryArray = arrayOf(17, 15, 7, 6, 4, 8, 10)
    var counter = 0
    println("")
    println("Inventory")
    while (counter < aIngredientsArray.size){
        print(aIngredientsArray[counter])
        print(": ")
        println(aInventoryArray[counter])
        counter ++
    }
    do{
        println("")
        println("1. ice cream")
        println("2. sprinkles")
        println("3. chocolate syrup")
        println("4. whipped cream")
        println("5. maraschino cherries")
        println("6. banana")
        println("7. walnuts")
        println("8. exit")
        print("to change inventory amounts, enter a number to select which item to change amount of: ")
        var selection = readLine()!!.toInt()
        if (selection != 8){
            // display the name of the item, the original amount
            var originalItem = aIngredientsArray[(selection - 1)]
            var originalAmount = aInventoryArray[(selection - 1)]
            // increase amount
            println("1. increase amount")
            // decrease amount
            println("2. decrease amount")
            print("please enter 1 or 2 to make a selection: ")
            var changeDir = readLine()!!.toInt()
            // how much to change amount
            print("by how much should the amount be increased or decreased? ")
            var changeAmount = readLine()!!.toInt()
            if (changeDir == 1){
                aInventoryArray[(selection - 1)] = aInventoryArray[(selection - 1)] + changeAmount
            }
            // take the selection number and plug it into the index value
            else if (changeDir == 2){
                if (changeAmount <= aInventoryArray[(selection - 1)]){
                    aInventoryArray[(selection - 1)] = aInventoryArray[(selection - 1)] - changeAmount
                }
                else{
                    println("Error: inventory amount cannot be negative")
                    println("")
                    aInventoryArray[(selection - 1)] = 0
                }
                // if amount would be less than zero

            }
            // print the arrays
            for (x in aIngredientsArray.indices){
                print(aIngredientsArray[x])
                print(": ")
                println(aInventoryArray[x])
            }
            // display the name of the item, the original amount, the amount added or taken away, and the new total
            println("")
            println("The original amount of $originalItem was $originalAmount")
            if (changeDir == 1){
                //var change
                println("the amount was increased by $changeAmount")
            }
            else if (changeDir == 2){
                if (changeAmount > originalAmount){
                    println("the amount was decreased by $originalAmount")
                }
                else{
                    println("the amount was decreased by $changeAmount")
                }
                // if amount taken away is greater than amount, print the original amount
            }
            // new total
            println("the new total is ${aInventoryArray[(selection - 1)]}")
        }

    }while(selection != 8)

}