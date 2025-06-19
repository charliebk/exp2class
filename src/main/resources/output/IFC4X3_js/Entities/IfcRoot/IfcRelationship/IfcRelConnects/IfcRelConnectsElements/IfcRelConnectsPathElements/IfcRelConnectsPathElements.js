class IfcRelConnectsPathElements extends IfcRelConnectsElements {
    constructor() {
        /** @type {IFCINTEGER[]} */
        this.RelatingPriorities = null;
        /** @type {IFCINTEGER[]} */
        this.RelatedPriorities = null;
        /** @type {IFCCONNECTIONTYPEENUM} */
        this.RelatedConnectionType = null;
        /** @type {IFCCONNECTIONTYPEENUM} */
        this.RelatingConnectionType = null;
    }

    // === WHERE CLAUSES ===
    // NormalizedRelatedPriorities : (SIZEOF(RelatedPriorities) = 0) OR (SIZEOF (QUERY (temp <* RelatedPriorities | {0 <= temp <= 100} )) = SIZEOF(RelatedPriorities))
    // NormalizedRelatingPriorities : (SIZEOF(RelatingPriorities) = 0) OR (SIZEOF (QUERY (temp <* RelatingPriorities | {0 <= temp <= 100} )) = SIZEOF(RelatingPriorities))
}
