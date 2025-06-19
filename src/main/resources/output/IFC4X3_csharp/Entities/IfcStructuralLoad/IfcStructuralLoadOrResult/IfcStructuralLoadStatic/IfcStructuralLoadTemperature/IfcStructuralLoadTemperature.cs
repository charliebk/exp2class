public class IfcStructuralLoadTemperature : IfcStructuralLoadStatic
{
    public IfcThermodynamicTemperatureMeasure DeltaTConstant { get; set; }
    public IfcThermodynamicTemperatureMeasure DeltaTY { get; set; }
    public IfcThermodynamicTemperatureMeasure DeltaTZ { get; set; }
}
