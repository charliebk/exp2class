public class IfcRelDefinesByTemplate : IfcRelDefines
{
    public SET [1:?] OF IfcPropertySetDefinition RelatedPropertySets { get; set; }
    public IfcPropertySetTemplate RelatingTemplate { get; set; }
}
