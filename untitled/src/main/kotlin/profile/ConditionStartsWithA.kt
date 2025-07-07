package org.example.profile

class ConditionStartsWithA: Condition {
    override fun isSuitable(person: Person): Boolean {
        return person.firstName.startsWith("A")
    }
}