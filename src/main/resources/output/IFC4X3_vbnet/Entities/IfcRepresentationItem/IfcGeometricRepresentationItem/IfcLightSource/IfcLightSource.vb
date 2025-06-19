Public Class IfcLightSource Inherits IfcGeometricRepresentationItem
    Public Name As IfcLabel
    Public LightColour As IfcColourRgb
    Public AmbientIntensity As IfcNormalisedRatioMeasure
    Public Intensity As IfcNormalisedRatioMeasure

    ' === EXTENDED BY ===
    ' IfcLightSourceAmbient
    ' IfcLightSourceDirectional
    ' IfcLightSourceGoniometric
    ' IfcLightSourcePositional
End Class
