public class IfcActionRequest : IfcControl
{
    public IfcActionRequestTypeEnum PredefinedType { get; set; }
    public IfcLabel Status { get; set; }
    public IfcText LongDescription { get; set; }
}
