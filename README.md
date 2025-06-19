# IFC EXPRESS Parser and Code Generator

Este proyecto permite **parsear archivos EXPRESS (.exp)** como los usados en estándares IFC (ej. IFC4X3) y generar automáticamente las clases en:

- ✅ Java
- ✅ C#
- ✅ Python
- ✅ VB.NET
- ✅ JavaScript

---


## 🚀 Uso
java -jar exp2class.jar exp-file language output-path root-folder-name>

-	exp-file	Ruta absoluta o relativa al archivo .exp (por ejemplo: IFC4X3.exp)
-   language	Lenguaje de salida. Opciones válidas: java, csharp, python, vbnet, js
- output-path>	Carpeta donde se generarán los archivos
- root-folder	Nombre de la carpeta raíz del proyecto generado (por ejemplo: IFC4X3)

### Compilación

```bash
mvn package
