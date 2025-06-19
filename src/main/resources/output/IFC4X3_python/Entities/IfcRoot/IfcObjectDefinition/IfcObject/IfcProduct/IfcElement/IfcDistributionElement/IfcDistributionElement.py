class IfcDistributionElement(IfcElement):
    def __init__(self):
        pass

    # === EXTENDED BY ===
    # IfcDistributionControlElement
    # IfcDistributionFlowElement

    # === INVERSE CLAUSES ===
    # HasPorts : SET [0:?] OF IfcRelConnectsPortToElement FOR RelatedElement
