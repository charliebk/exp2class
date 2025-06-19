public class IfcRelDefinesByObject : IfcRelDefines
{
    public SET [1:?] OF IfcObject RelatedObjects { get; set; }
    public IfcObject RelatingObject { get; set; }
}
