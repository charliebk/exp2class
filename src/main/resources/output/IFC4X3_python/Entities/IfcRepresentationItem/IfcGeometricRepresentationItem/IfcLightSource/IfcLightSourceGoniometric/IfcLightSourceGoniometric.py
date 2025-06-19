class IfcLightSourceGoniometric(IfcLightSource):
    def __init__(self):
        self.Position: IfcAxis2Placement3D = None
        self.ColourAppearance: IfcColourRgb = None
        self.ColourTemperature: IfcThermodynamicTemperatureMeasure = None
        self.LuminousFlux: IfcLuminousFluxMeasure = None
        self.LightEmissionSource: IfcLightEmissionSourceEnum = None
        self.LightDistributionDataSource: IfcLightDistributionDataSourceSelect = None
