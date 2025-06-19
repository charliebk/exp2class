public class IfcRelConnectsPathElements extends IfcRelConnectsElements {
    public List<IfcInteger> RelatingPriorities;
    public List<IfcInteger> RelatedPriorities;
    public IfcConnectionTypeEnum RelatedConnectionType;
    public IfcConnectionTypeEnum RelatingConnectionType;

    // === WHERE CLAUSES ===
    // NormalizedRelatedPriorities : (SIZEOF(RelatedPriorities) = 0) OR (SIZEOF (QUERY (temp <* RelatedPriorities | {0 <= temp <= 100} )) = SIZEOF(RelatedPriorities))
    // NormalizedRelatingPriorities : (SIZEOF(RelatingPriorities) = 0) OR (SIZEOF (QUERY (temp <* RelatingPriorities | {0 <= temp <= 100} )) = SIZEOF(RelatingPriorities))
}
