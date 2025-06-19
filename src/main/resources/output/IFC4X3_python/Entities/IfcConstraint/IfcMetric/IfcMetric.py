class IfcMetric(IfcConstraint):
    def __init__(self):
        self.Benchmark: IfcBenchmarkEnum = None
        self.ValueSource: IfcLabel = None
        self.DataValue: IfcMetricValueSelect = None
        self.ReferencePath: IfcReference = None
