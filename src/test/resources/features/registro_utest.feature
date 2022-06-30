#language: es
  Característica: Registrar usuario en Utest
    Yo como usuario quiero ingresar a la plataforma Utest.com para registerarme
    @Registro
    Esquema del escenario: : Registrar datos de usuario
      Dado que Carlos desea registrarse en Utest
      Cuando el ingresa todos los datos de registro
        | nombre   | apellido   | correo   | mes   | dia   | anio | idioma | ciudad | codigoPostal | pais | sistema | version | idiomaSistema | movil | modeloMovil | sitemaOperativoMovil | contrasenia | confirmaContrasenia |
        | <nombre> | <apellido> | <correo> | <mes> | <dia> | <anio> | <idioma> | <ciudad> | <codigoPostal> | <pais> | <sistema> | <version> | <idiomaSistema> | <movil> | <modeloMovil> | <sitemaOperativoMovil> | <contrasenia> | <confirmaContrasenia> |
      Entonces comprueba que se registro correctamente
        | mensaje |
        | <mensaje> |
      Ejemplos:
        | nombre | apellido | correo                 | mes     | dia | anio | idioma  | ciudad | codigoPostal | pais     | sistema | version | idiomaSistema | movil    | modeloMovil  | sitemaOperativoMovil | contrasenia    | confirmaContrasenia | mensaje        |
        | Carlos | Buitrago | buitrago79@hotmail.com | October | 22  | 1979 | Spanish | Ibague | 73001        | Colombia | Windows | 10      | English       | Motorola | Moto G6 Plus | Android 9.0 (Pie)    | LaVacalola2022 | LaVacalola2022      | Complete Setup |
