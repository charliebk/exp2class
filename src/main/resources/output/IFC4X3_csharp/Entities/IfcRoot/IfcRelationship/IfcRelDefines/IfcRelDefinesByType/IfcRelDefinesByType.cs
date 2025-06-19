public class IfcRelDefinesByType : IfcRelDefines
{
    public SET [1:?] OF IfcObject RelatedObjects { get; set; }
    public IfcTypeObject RelatingType { get; set; }
}
