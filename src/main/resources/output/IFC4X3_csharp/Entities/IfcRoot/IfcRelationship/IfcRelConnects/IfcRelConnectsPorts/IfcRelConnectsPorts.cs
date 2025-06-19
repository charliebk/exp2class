public class IfcRelConnectsPorts : IfcRelConnects
{
    public IfcPort RelatingPort { get; set; }
    public IfcPort RelatedPort { get; set; }
    public IfcElement RealizingElement { get; set; }

    // === WHERE CLAUSES ===
    // NoSelfReference : RelatingPort :<>: RelatedPort
}
