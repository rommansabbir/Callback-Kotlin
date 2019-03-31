class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val myInterface : MyInterface = ImplementedClass()
            val functionalClass = FunctionalClass(myInterface)
            functionalClass.doMath(5,6)
        }
    }
}