public class IfcSimplePropertyTemplate : IfcPropertyTemplate
{
    public IfcSimplePropertyTemplateTypeEnum TemplateType { get; set; }
    public IfcLabel PrimaryMeasureType { get; set; }
    public IfcLabel SecondaryMeasureType { get; set; }
    public IfcPropertyEnumeration Enumerators { get; set; }
    public IfcUnit PrimaryUnit { get; set; }
    public IfcUnit SecondaryUnit { get; set; }
    public IfcLabel Expression { get; set; }
    public IfcStateEnum AccessState { get; set; }
}
