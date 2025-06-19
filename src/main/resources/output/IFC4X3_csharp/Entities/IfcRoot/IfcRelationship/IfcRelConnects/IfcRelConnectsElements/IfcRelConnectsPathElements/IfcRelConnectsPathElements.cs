public class IfcRelConnectsPathElements : IfcRelConnectsElements
{
    public List<IfcInteger> RelatingPriorities { get; set; }
    public List<IfcInteger> RelatedPriorities { get; set; }
    public IfcConnectionTypeEnum RelatedConnectionType { get; set; }
    public IfcConnectionTypeEnum RelatingConnectionType { get; set; }

    // === WHERE CLAUSES ===
    // NormalizedRelatedPriorities : (SIZEOF(RelatedPriorities) = 0) OR (SIZEOF (QUERY (temp <* RelatedPriorities | {0 <= temp <= 100} )) = SIZEOF(RelatedPriorities))
    // NormalizedRelatingPriorities : (SIZEOF(RelatingPriorities) = 0) OR (SIZEOF (QUERY (temp <* RelatingPriorities | {0 <= temp <= 100} )) = SIZEOF(RelatingPriorities))
}
