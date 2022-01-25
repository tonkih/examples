package ru.ait.example.card;

import ru.ait.example.operation.CashOperation;
import ru.ait.example.operation.SpendOperation;
import ru.ait.example.operation.TopUpOperation;

public interface Card extends CashOperation, SpendOperation, TopUpOperation {}
