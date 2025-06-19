public class IfcRelServicesBuildings : IfcRelConnects
{
    public IfcSystem RelatingSystem { get; set; }
    public SET [1:?] OF IfcSpatialElement RelatedBuildings { get; set; }
}
