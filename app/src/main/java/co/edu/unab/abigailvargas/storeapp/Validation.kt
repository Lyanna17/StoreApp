package co.edu.unab.abigailvargas.storeapp

import android.util.Patterns

fun validateEmail(email:String): Pair<Boolean, String>{

    return when{
        email.isEmpty() -> Pair(false, "El correo no puede estar vacío")
        !email.endsWith("@unab.edu.co") -> Pair(false, "Solo correos institucionales")
        !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> Pair(false, "Solo correos válidos")
        else -> {
            Pair(true, "")
        }
    }
}

fun validatePassword(password:String): Pair<Boolean, String>{

    return when{
        password.isEmpty() -> Pair(false, "La contraseña no puede estar vacía")
        password.length < 8 -> Pair(false, "La contraseña debe tener al menos 8 caracteres")
        else -> {
            Pair(true, "")
        }
    }
}