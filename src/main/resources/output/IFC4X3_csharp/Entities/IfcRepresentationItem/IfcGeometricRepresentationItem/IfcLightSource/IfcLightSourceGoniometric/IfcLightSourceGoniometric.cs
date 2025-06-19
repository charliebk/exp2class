public class IfcLightSourceGoniometric : IfcLightSource
{
    public IfcAxis2Placement3D Position { get; set; }
    public IfcColourRgb ColourAppearance { get; set; }
    public IfcThermodynamicTemperatureMeasure ColourTemperature { get; set; }
    public IfcLuminousFluxMeasure LuminousFlux { get; set; }
    public IfcLightEmissionSourceEnum LightEmissionSource { get; set; }
    public IfcLightDistributionDataSourceSelect LightDistributionDataSource { get; set; }
}
