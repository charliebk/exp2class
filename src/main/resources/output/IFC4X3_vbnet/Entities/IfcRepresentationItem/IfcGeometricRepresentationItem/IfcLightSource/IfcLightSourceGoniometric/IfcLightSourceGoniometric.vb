Public Class IfcLightSourceGoniometric Inherits IfcLightSource
    Public Position As IfcAxis2Placement3D
    Public ColourAppearance As IfcColourRgb
    Public ColourTemperature As IfcThermodynamicTemperatureMeasure
    Public LuminousFlux As IfcLuminousFluxMeasure
    Public LightEmissionSource As IfcLightEmissionSourceEnum
    Public LightDistributionDataSource As IfcLightDistributionDataSourceSelect
End Class
