#Autor: xxxxxx
  @stories
  Feature: Academy Choucair
    As an user, I want to learn how to automate in screamplay at the Choucair Academy With the automation course

    @scenario1
  Scenario: Search for a automation course

      Given than brandon wants to learn automation at the academy choucair
        | strUser  | strPassword |
        | 1128266108 | Choucair2020* |

      When he search for the course on the choucair academy platform
        | strCourse |
        | Prueba Técnica - Analista Bancolombia |


      Then he finds the course called resources
      |strLabel|
      |Prueba Técnica - Analista Bancolombia |
