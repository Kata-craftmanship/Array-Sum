# Bonnes pratiques SOLID, Object Calisthenics et Poka Yoke

## SOLID

1. Single responsibility principle
2. Open/closed principle
3. Liskov substitution principle
4. Interface segregation principle
5. Dependency inversion principle

[Documentation SOLID](https://gitlab.insee.fr/craftsmanship/documentation/-/wikis/concepts/SOLID)

## 9 OC Rules

1. Only One Level Of Indentation Per Method
2. Don't Use The ELSE Keyword
3. Wrap All Primitives And Strings
4. First-Class Collections
5. One Dot Per Line
6. Don't Abbreviate
7. Keep All Entities Small
8. No Classes With More Than Two Instance Variables
9. No Getters/Setters/Properties

[Documentation OC](https://gitlab.insee.fr/craftsmanship/documentation/-/wikis/concepts/Objects-Calisthenics)

## Poka Yoke

[Documentation Poka Yoke](https://gitlab.insee.fr/craftsmanship/documentation/-/wikis/concepts/POKA-YOKE)

## Sum Of Two Integers Problem

> The purpose is to implement the code that returns true when the sum of two integers in an array is found.
> **No nested loops allowed !**

#### API (KISS)

    found = ArrayUtils::containsSum([1, 3, 4, -4], 8); // false
    found = ArrayUtils::containsSum([1, 3, 4, -4], 0); // true
