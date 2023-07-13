library(dplyr)

# this creates the dataframe
datafrm = read.csv('Data Files/pokemon_data.csv')

main <- function(){

    print("Enter any generation (1-7): ")
    userInp = readline(prompt = "> ")
    
    # convert the input value to an integer
    userInp = as.integer(userInp)

    # this will filter any row
    newdata = subset(datafrm, generation == userInp,select = c('defense','attack'))

    list_x <- rep()
    list_y <- rep()

    for (i in newdata[1]){
        list_x <- append(list_x, i)
    }

    for (j in newdata[2]){
        list_y <- append(list_y, j)
    }

    plot(list_x, list_y, main=stringr::str_interp("Generation ${userInp}"), xlab="Defense", ylab="Attack")
}

main()