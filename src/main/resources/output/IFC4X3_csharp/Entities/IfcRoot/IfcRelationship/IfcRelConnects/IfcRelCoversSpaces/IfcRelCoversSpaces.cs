public class IfcRelCoversSpaces : IfcRelConnects
{
    public IfcSpace RelatingSpace { get; set; }
    public SET [1:?] OF IfcCovering RelatedCoverings { get; set; }
}
