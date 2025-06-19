public class IfcBuilding : IfcFacility
{
    public IfcLengthMeasure ElevationOfRefHeight { get; set; }
    public IfcLengthMeasure ElevationOfTerrain { get; set; }
    public IfcPostalAddress BuildingAddress { get; set; }
}
