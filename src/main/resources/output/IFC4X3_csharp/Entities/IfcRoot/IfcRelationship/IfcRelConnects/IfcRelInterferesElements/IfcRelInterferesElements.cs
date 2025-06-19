public class IfcRelInterferesElements : IfcRelConnects
{
    public IfcInterferenceSelect RelatingElement { get; set; }
    public IfcInterferenceSelect RelatedElement { get; set; }
    public IfcConnectionGeometry InterferenceGeometry { get; set; }
    public IfcIdentifier InterferenceType { get; set; }
    public IfcLogical ImpliedOrder { get; set; }
    public IfcSpatialZone InterferenceSpace { get; set; }

    // === WHERE CLAUSES ===
    // NoSelfReference : RelatingElement :<>: RelatedElement
}
