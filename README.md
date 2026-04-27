# Sistema de Gestión de Pedidos y Ventas

Este proyecto implementa un sistema de gestión de pedidos utilizando inyección de dependencias con Jakarta CDI y Quarkus.

Permite registrar pedidos, procesar ventas, generar comprobantes y enviar notificaciones a clientes mediante distintos canales.

---

## Descripción

El sistema simula el flujo completo de procesamiento de pedidos en una empresa, incluyendo:

- Registro de pedidos
- Procesamiento de ventas
- Generación de comprobantes PDF
- Envío de notificaciones (Email, SMS, WhatsApp)
- Manejo de distintos tipos de pago
- Cálculo de totales
- Estadísticas de ventas

Este proyecto fue desarrollado como parte del curso **Programación Avanzada 2**.

---

## Tecnologías utilizadas

- Java 21
- Quarkus
- Jakarta CDI (Inyección de dependencias)
- Maven
- Javadoc

---

## Estructura del proyecto

Las principales clases del sistema incluyen:

- `PedidoService`
- `ProcesadorVentaService`
- `ProcesadorVentaEnLineaService`
- `NotificadorSelector`
- `NotificadorMail`
- `NotificadorSMS`
- `NotificadorWhatsapp`
- `Factura`
- `ComprobantePDF`
- `PagoEfectivo`
- `PagoTarjetaCredito`
- `EstadisticasVentasGlobales`

---

## Cómo ejecutar el proyecto

1. Clonar el repositorio:
    ```bash 
    git clone https://github.com/ak-47979/TallerN8.git

2. **Entrar en la carpeta del proyecto:**
   ```bash
   cd uce-edu-pa2-api-as


3. **Compilar el proyecto:**
   ```bash
   mvn clean install

4. **Ejecutar el proyecto:**
   ```bash
   mvn quarkus:dev
---
## Generar documentación Javadoc
1. Para generar la documentación automática:
mvn javadoc:javadoc

2. Luego abrir:
target/reports/apidocs/index.html
---

## Funcionalidades principales

✔ Registro de pedidos
✔ Procesamiento de ventas
✔ Generación de comprobantes
✔ Envío de notificaciones
✔ Manejo de pagos
✔ Estadísticas de ventas

---

# Ejemplos de beans usando los scopes en CDI:

- `@ApplicationScoped`
- `@Singleton`
- `@Dependent`

---

# Ejemplos de beans `@ApplicationScoped`

Los beans con `@ApplicationScoped` se crean **una sola vez para toda la aplicación** y se comparten entre todos los componentes.

1. **EstadisticasVentasGlobales**  
   Contador total de ventas en toda la aplicación.

2. **CacheProductos**  
   Almacena en caché los productos consultados con frecuencia.

3. **ServicioEmail**  
   Servicio encargado de enviar correos electrónicos desde toda la aplicación.

4. **GestorUsuarios**  
   Administra la lista global de usuarios del sistema.

5. **ServicioNotificaciones**  
   Gestiona el envío de notificaciones a los usuarios.

6. **RegistroErrores**  
   Mantiene un registro global de errores del sistema.

7. **ConfiguracionBaseDatos**  
   Contiene los parámetros de conexión a la base de datos.

---

# Ejemplos de beans `@Singleton`

Los beans con `@Singleton` garantizan que **solo exista una única instancia en todo el sistema**.

1. **GestorSeguridadGlobal**  
   Administra la seguridad general del sistema.

2. **PlanificadorTareas**  
   Ejecuta tareas programadas automáticamente.

3. **AdministradorRecursos**  
   Controla el uso de recursos únicos del sistema.

4. **ServicioAuditoriaCentral**  
   Registra las actividades importantes para auditoría.

5. **ContadorGlobalSistema**  
   Mantiene un contador único dentro del sistema.

6. **AdministradorCachePrincipal**  
   Gestiona una única caché principal.

7. **GestorEstadoAplicacion**  
   Mantiene el estado general de la aplicación.

---

# Ejemplos de beans `@Dependent`

Los beans con `@Dependent` crean **una nueva instancia cada vez que se utilizan**.

1. **ValidadorEmail**  
   Valida direcciones de correo electrónico.

2. **ConversorMoneda**  
   Convierte valores entre diferentes monedas.

3. **ProcesadorPago**  
   Procesa pagos individuales en cada transacción.

4. **GeneradorFactura**  
   Genera una factura para cada venta realizada.

5. **CalculadoraImpuestos**  
   Calcula los impuestos correspondientes a cada operación.

6. **ParserJSON**  
   Convierte datos en formato JSON a objetos utilizables.

7. **CalculadoraPromocion**  
   Calcula descuentos y promociones aplicables.
---

## Autor

[**Andy Suquilandi**-AvanzadaII](https://github.com/ak-47979)
---

## Licencia

Este proyecto es únicamente para fines académicos.

