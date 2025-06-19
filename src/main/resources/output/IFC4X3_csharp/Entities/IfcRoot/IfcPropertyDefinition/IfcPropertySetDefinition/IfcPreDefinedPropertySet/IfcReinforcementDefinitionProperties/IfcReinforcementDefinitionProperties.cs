public class IfcReinforcementDefinitionProperties : IfcPreDefinedPropertySet
{
    public IfcLabel DefinitionType { get; set; }
    public List<IfcSectionReinforcementProperties> ReinforcementSectionDefinitions { get; set; }
}
