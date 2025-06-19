public class IfcSectionProperties : IfcPreDefinedProperties
{
    public IfcSectionTypeEnum SectionType { get; set; }
    public IfcProfileDef StartProfile { get; set; }
    public IfcProfileDef EndProfile { get; set; }
}
