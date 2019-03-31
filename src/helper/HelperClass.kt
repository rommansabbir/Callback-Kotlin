package helper

class HelperClass : UpdatedListInterface {
    override fun onSuccess(msg: String) {
        println(msg)
    }

    override fun onFailure(msg: String) {
        println(msg)
    }
}