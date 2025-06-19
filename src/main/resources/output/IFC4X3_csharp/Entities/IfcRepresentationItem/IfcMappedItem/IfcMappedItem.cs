public class IfcMappedItem : IfcRepresentationItem
{
    public IfcRepresentationMap MappingSource { get; set; }
    public IfcCartesianTransformationOperator MappingTarget { get; set; }
}
