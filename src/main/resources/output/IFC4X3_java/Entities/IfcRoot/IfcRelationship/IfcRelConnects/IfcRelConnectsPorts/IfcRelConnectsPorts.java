public class IfcRelConnectsPorts extends IfcRelConnects {
    public IfcPort RelatingPort;
    public IfcPort RelatedPort;
    public IfcElement RealizingElement;

    // === WHERE CLAUSES ===
    // NoSelfReference : RelatingPort :<>: RelatedPort
}
