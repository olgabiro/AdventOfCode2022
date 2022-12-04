package day3

fun create(description1 : String, 
           description2: String, 
           description3 : String) : RucksackGroup {
  
  return RucksackGroup(create(description1), 
                       create(description2), 
                       create(description3))
}