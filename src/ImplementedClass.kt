class ImplementedClass : MyInterface {
    override fun onSuccess(msg: String) {
        println(msg)
    }

    override fun onFail(msg: String) {
        println(msg)
    }
}