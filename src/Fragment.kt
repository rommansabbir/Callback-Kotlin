import helper.FunctionalClass
import helper.HelperClass

class Fragment {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val helperClass = HelperClass()
            val functionalClass = FunctionalClass(helperClass)
            functionalClass.getUpdatedList("Romman", 1997)
        }
    }
}