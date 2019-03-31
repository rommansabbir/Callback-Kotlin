package helper

class FunctionalClass(private val updatedListInterface: UpdatedListInterface) {

    fun getUpdatedList(name : String, id : Int){
        updatedListInterface.onSuccess("Name: $name, ID: $id")
    }
}