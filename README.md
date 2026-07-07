LlanquihueTour - Agencia de Turismo Llanquihue Tour


Este proyecto consiste en una aplicación de consola en Java desarrollada para la agencia de turismo **Llanquihue Tour**, diseñada como parte de las actividades prácticas de la asignatura **Desarrollo Orientado a Objetos I** de **Duoc UC**.

En esta versión el sistema implementa **polimorfismo y colecciones genéricas** para gestionar de manera dinámica y flexible los servicios turísticos ofrecidos por la agencia.

---

-->Características de la versión

El sistema ha sido adaptado y extendido cumpliendo rigurosamente los siguientes criterios técnicos de la evaluación (Forma B):

* **Jerarquía de Clases:** Estructuración de la superclase `ServicioTuristico` y la subclase especializada `RutaGastronomica`.
* **Sobresctitura de Métodos (`@Override`):** Implementación y personalización del método `mostrarInformacion()` en la subclase para desplegar tanto los datos comunes del servicio como los detalles específicos de la ruta gastronómica.
* **Colección Polimórfica:** Uso de una colección genérica `List<ServicioTuristico>` instanciada mediante `ArrayList` dentro de la clase `GestorServicios`, la cual almacena un catálogo inicial de 5 servicios.
* **Recorrido Polimórfico:** Iteración de la colección a través de un bucle `for-each` utilizando referencias exclusivas de la superclase `ServicioTuristico`, permitiendo que Java resuelva dinámicamente el comportamiento correcto en tiempo de ejecución.
* **Arquitectura de Paquetes:** Organización limpia y modular del código fuente del proyecto.

---

-->Estructura del Proyecto

El código está organizado bajo una estructura de paquetes según sus responsabilidades:

```text
src/
└── model/               # Clases de la jerarquía de datos
    ├── ServicioTuristico.java
    └── RutaGastronomica.java
└── data/                # Lógica de gestión y colecciones
    └── GestorServicios.java
└── ui/                  # Punto de entrada y ejecución del sistema
    └── Main.java
