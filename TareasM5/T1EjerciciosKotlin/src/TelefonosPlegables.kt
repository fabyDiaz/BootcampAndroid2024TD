fun main(){

    println("Telefono normal")
    var phone1 = Phone()
    print("PRENDEMOS: ")
    phone1.switchOn()
    phone1.checkPhoneScreenLight()
    print("APAGAMOS: ")
    phone1.switchOff()
    phone1.checkPhoneScreenLight()

    println("\n\n Telefono plegable")
    println("prueba con el teléfono abierto")
    var phone2 = FoldablePhone()
    phone2.telefonoAbierto()
    print("PRENDEMOS: ")
    phone2.switchOn()
    phone2.checkPhoneScreenLight()
    print("APAGAMOS: ")
    phone2.switchOff()
    phone2.checkPhoneScreenLight()

    println("\n\nprueba con el teléfono cerrado")
    phone2.telefonoCerrado()
    print("PRENDEMOS: ")
    phone2.switchOn()
    phone2.checkPhoneScreenLight()
    print("PRENDEMOS: ")
    phone2.checkPhoneScreenLight()
}

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}


class FoldablePhone (var abierto: Boolean = true): Phone(){

    override fun switchOn() {
        if (abierto==true){
            isScreenLightOn=true
        }else
            isScreenLightOn=false
    }

    fun telefonoCerrado() {
        abierto = false

    }
    fun telefonoAbierto(){
        abierto=true
    }
}