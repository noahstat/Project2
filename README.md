# Project2
CS2334 Project two

MesoInherit extends MesoStation
    String[] stations
    this variable help all the read in stations from mesonet.txt, everytime the constructor
    was called it cleared the array and then rewrote it

    int size
    this variable help the current size of the array since it was oversized

    MesoInherit(String)
    this was the main constructor and called super with the given string as the argument 
    and then called the readIn method catching any IOException

    MesoInherit(MesoStation)
    this constructor took the stID of the MesoStation object and cloned it by calling supe with the same 
    ID as the argument

    ReadIn
    This one did most of the work, it read in the file making sure it only contained 
    letters and then put it into the array also making sure there was enough room in the array

    Expand
    If there was not enough room it added 20 to the size, 
    made a new array and then copied its contents back into the old array

    calAverage()
    made a new LetterAvg object and then called the calAverage from there returning the int array

    letterAverage()
    made a new LetterAvg object and then called the letterAverage from there 
    returning the average char
  
LetterAvg extends MesoInherit
    char key
    the key that was used to search for the stations starting with the same letter

    char letterAvg
    held the letter average found

    int numberOfStations
    held the number of stations that started with the same letter as the key

    LetterAvg(char)
    this took in a char that was used for the key in the other methods, I just made the stId
    to be PLEA so it wouldn't get angry at me for not calling super

    letterAvg(String)
    this took the string and called super with it as the argument

    letterAverage()
    took the ACSII value of the letter and found the floor, ceiling, and rounded version 
    but only used the rounded one to find the average letter

    calAverage()
    took the ACSII value of the letter and found the floor, ceiling, and rounded version
    and then put them into an int array to be returned

    numberOfStations()
    this made a loop searching for stations that had the same beginning letter as the key and returned
    the number and aslo set the class variable to the same thing

    toString()
    while the number of stations found was less than the number of stations trying to be found 
    it searched through the array and added statioins with the same fist letter as the key to a string 
  
PosAvg extends MesoInherit
    int index
    was the index of the station in the array

    PosAvg(String)
    took the string and called super with it then found the index of the ID and stored it in index

    indexOfStation()
    for some reason my index was always off by 8 and I couldn't find the reason so it returns 
    index - 8 if the index was greater than 8 and this seemed to work

    getAverages()
    filled an array with the stations plus and minus two around it returning an array of null if they
    were too close to the boundries

    toString()
    made an array filled with whatever get averages returned and then printed them out in the 
    correct order so the averages were actually right

MesoStation
    String stID
    this held the ID of the object

    MesoStation(String)
    set the stID to the string given

    getStID()
    this returned the stID
