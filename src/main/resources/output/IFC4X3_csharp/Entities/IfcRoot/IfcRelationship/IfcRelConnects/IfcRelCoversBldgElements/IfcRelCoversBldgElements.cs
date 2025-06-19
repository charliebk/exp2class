public class IfcRelCoversBldgElements : IfcRelConnects
{
    public IfcElement RelatingBuildingElement { get; set; }
    public SET [1:?] OF IfcCovering RelatedCoverings { get; set; }
}
