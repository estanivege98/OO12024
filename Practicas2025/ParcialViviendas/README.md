# Parcial Viviendas #

Nos contratan para desarrollar una plataforma para una empresa de mantenimiento de viviendas. En particular nos enfocaremos en las contrataciones de los servicios ofrecidos y los montos a pagar por los mismos. El sistema debe permitir la siguiente funcionalidad:
Registrar Clientes: se provee un nombre y una dirección. El sistema registra el cliente y lo retorna.

Registrar un servicio de limpieza: se provee un precio por hora, una cantidad de horas y una tarifa mínima. El sistema registra el servicio y lo retorna.

 Registrar un servicio de parquización: se provee un precio por hora, una cantidad de horas, cantidad de máquinas a utilizar y un costo de mantenimiento de las mismas. El sistema registra el servicio y lo retorna.

Además, se debe dar la posibilidad de contratar estos servicios:

Contratar por única vez: se provee un cliente, la fecha y un servicio. El servicio quedará contratado para dicho cliente en la fecha especificada.

Contratar de forma prolongada: se provee un cliente, un servicio, una fecha inicial y una cantidad de días (asumir que esta cantidad es siempre mayor a uno). El servicio quedará contratado por dicho cliente la cantidad de días especificada.

Obtener el monto a pagar por un cliente: dado un cliente, se retorna el monto a abonar por todos los servicios contratados, según se describe a continuación:

- El monto a abonar por las contrataciones por única vez es el monto a abonar del servicio. En caso de ser contratado para un fin de semana se cobra un recargo del 15%.

- El monto a abonar por las contrataciones prolongadas es el monto a abonar del servicio multiplicado por la cantidad de días que fue contratado. En caso de haber sido contratado por más de 5 días se le realiza un descuento del 10%. 

En cuanto a los servicios, el monto a abonar se calcula de la siguiente manera:

-    El monto a abonar de los servicios de limpieza se calcula como el precio por hora multiplicado por la cantidad de horas. Este valor no debe ser menor a la tarifa mínima y en caso de serlo, se abonará dicha tarifa.

-    El monto a abonar de los servicios de parquización se calcula como el precio por hora multiplicado por la cantidad de horas y a este monto se le adiciona el costo de mantenimiento de las máquinas multiplicado por la cantidad de máquinas.

Obtener la cantidad de servicios con monto mayor a un valor: dado un valor, se retorna la cantidad de servicios que brinda la plataforma cuyos montos a abonar lo superan.

Tareas:

1.    Diseño de su solución en un diagrama de clases UML.

2. Implementación en Java de la funcionalidad requerida.

3.    Implemente los tests necesarios para la funcionalidad de obtener el monto a pagar por un cliente considerando sólo contrataciones de única vez para servicio de limpieza.

Notas:

-    Implemente todos los constructores que considere necesarios. 

-    Puede implementar un getter y un setter que necesite, y asumir la existencia del resto. 

-    Para verificar si una fecha (instancia de LocalDate) cae en fin de semana, puede utilizar: 

             DayOfWeek dia = DayOfWeek.from(fecha);
             dia.equals(DayOfWeek.SATURDAY) || dia.equals(DayOfWeek.SUNDAY);

