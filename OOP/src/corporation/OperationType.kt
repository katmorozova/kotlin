package corporation

enum class OperationType (val title: String){

    EXIT("Exit"),
    REGISTER("Register new item"),
    SHOW_ALL_ITEMS("Show all items"),
    REMOVE_PRODUCT_CARD("Remove product card"),
    REGISTER_NEW_EMPLOYEE("Register new employee"),
    FIRE_EMPLOYEE("Fire an employee"),
    SHOW_ALL_EMPLOYEES("Show all employees"),
    CHANGE_SALARY("Change salary"),
    CHANGE_AGE("Change age")
}