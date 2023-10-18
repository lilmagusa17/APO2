**TESTING DOCUMENTATION**

**STUDENT**

**Scenaries Set Up:**

+-----------------------+-------------+--------------------------------+
| **Name**              | **Class**   | **Scenary**                    |
+=======================+=============+================================+
| setUpScenary1         | Student     | New Student                    |
|                       |             |                                |
|                       |             | ![](media/image1.png           |
|                       |             | ){width="1.5088429571303588in" |
|                       |             | height="1.1794477252843394in"} |
+-----------------------+-------------+--------------------------------+

**Test Cases Design:**

  --------------------------------------------------------------------------------------
  **Test                                                                    
  Objective:**                                                              
  -------------- --------------------------- ----------------- ------------ ------------
  **Class**      **Method**                  **Scenary**       **Entry      **Result**
                                                               Values**     

  Student        calculateBmi()              setUpScenary1     69.0, 1.60   26.95

  Student        calculateBmi()              setUpScenary1     53.3, 1.56   21.9

  Student        calculateClassification()   setUpScenary1     17.9         2

  Student        calculateClassification()   setUpScenary1     22.5         2

  Student        calculateClassification()   setUpScenary1     17.9         1

  Student        calculateClassification()   setUpScenary1     27.9         3

  Student        calculateClassification()   setUpScenary1     37.9         4

  Student        calculateClassification()   setUpScenary1     47.9         5
  --------------------------------------------------------------------------------------

**NUTRITION MANAGEMENT**

**Scenaries Set Up:**

+--------------+---------------------+--------------------------------+
| **Name**     | **Class**           | **Scenary**                    |
+==============+=====================+================================+
| s            | NutritionManagement | NutritionManagement with no    |
| etUpScenary1 |                     | students                       |
|              |                     |                                |
|              |                     | ![](media/image2.pn            |
|              |                     | g){width="2.312937445319335in" |
|              |                     | height="0.7487926509186351in"} |
+--------------+---------------------+--------------------------------+
| s            | NutritionManagement | Null                           |
| etUpScenary2 |                     |                                |
+--------------+---------------------+--------------------------------+
| s            | NutritionManagement | NutritionManagement with 1     |
| etUpScenary3 |                     | student                        |
|              |                     |                                |
|              |                     | ![](media/image3.pn            |
|              |                     | g){width="2.109530839895013in" |
|              |                     | height="1.7515507436570428in"} |
+--------------+---------------------+--------------------------------+
| s            | NutritionManagement | NutritionManagement with 2 low |
| etUpScenary4 |                     | weight students                |
|              |                     |                                |
|              |                     | ![](media/image4.pn            |
|              |                     | g){width="1.798976377952756in" |
|              |                     | height="1.5197320647419073in"} |
+--------------+---------------------+--------------------------------+
| s            | NutritionManagement | NutritionManagement with 2     |
| etUpScenary5 |                     | normal weight students         |
|              |                     |                                |
|              |                     | ![](media/image5.png           |
|              |                     | ){width="1.7793569553805775in" |
|              |                     | height="1.4970034995625547in"} |
+--------------+---------------------+--------------------------------+
| s            | NutritionManagement | NutritionManagement with 2     |
| etUpScenary6 |                     | overweight students            |
|              |                     |                                |
|              |                     | ![](media/image6.pn            |
|              |                     | g){width="1.868982939632546in" |
|              |                     | height="1.588921697287839in"}  |
+--------------+---------------------+--------------------------------+
| s            | NutritionManagement | NutritionManagement with 2     |
| etUpScenary7 |                     | obese students                 |
|              |                     |                                |
|              |                     | ![](media/image7.png           |
|              |                     | ){width="1.9689359142607175in" |
|              |                     | height="1.671512467191601in"}  |
+--------------+---------------------+--------------------------------+
| s            | NutritionManagement | NutritionManagement with 2     |
| etUpScenary8 |                     | morbid obesity students        |
|              |                     |                                |
|              |                     | ![](media/image8.png           |
|              |                     | ){width="2.0630774278215225in" |
|              |                     | height="1.7232064741907263in"} |
+--------------+---------------------+--------------------------------+

**Test Cases Design:**

  --------------------------------------------------------------------------------------------
  **Test Objective:**                                                             
  --------------------- -------------------------- --------------- -------------- ------------
  **Class**             **Method**                 **Scenary**     **Entry        **Result**
                                                                   Values**       

  NutritionManagement   isEmpty()                  setUpScenary1   N/A            True

  NutritionManagement   add()                      setUpScenary2   "A00398722",   1
                                                                   "Maria",       
                                                                   "Alvarez", 19, 
                                                                   'f', 1.56,     
                                                                   53.5, 1.56, 55 

  NutritionManagement   add()                      setUpScenary3   "A00111111",   2
                                                                   "Juan",        
                                                                   "Silva", 20,   
                                                                   'm', 1.76,     
                                                                   73.5, 1.73, 68 

  NutritionManagement   lowWeightStudentApr()      setUpScenary4   N/A            2

  NutritionManagement   lowWeightStudentSep()      setUpScenary4   N/A            2

  NutritionManagement   normalWeightStudentApr()   setUpScenary5   N/A            2

  NutritionManagement   normalWeightStudentSep()   setUpScenary5   N/A            2

  NutritionManagement   overWeightStudentApr()     setUpScenary6   N/A            2

  NutritionManagement   overWeightSep()            setUpScenary6   N/A            2

  NutritionManagement   obesityStudentApr()        setUpScenary7   N/A            2

  NutritionManagement   obesityStudentSep()        setUpScenary7   N/A            2

  NutritionManagement   morbidStudentApr()         setUpScenary8   N/A            2

  NutritionManagement   morbidStudentSep()         setUpScenary8   N/A            2
  --------------------------------------------------------------------------------------------
