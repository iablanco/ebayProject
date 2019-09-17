# ebayProject
Busqueda de pilas en ebay

Tecnologías
Gradle
Selenium
Java


Setear la siguientes propiedades antes de ejecutar
Ejemplo
'appium_serverip', '127.0.0.1'
'appium_serverport', '5113'
'appium_agentport', '7100'
'device_name', 'Nexus_5X_API27'
'avd_name', 'Nexus_5X_API27'

Comando para ejecutar desde linea de comando
 
gradle task AllTest -Pappium_serverip="127.0.0.1" -Pappium_sererport="5553" -Pappium_agentport="7200" -Pdevice_name="Nexus_5X_API27" -Pavd_name="Nexus_5X_API27"