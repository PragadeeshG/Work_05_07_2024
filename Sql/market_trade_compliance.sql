create table if not exists market_trade_compliance(
market_trade_compliance_code Integer not null,
custodial_account_effcetive Integer null,
custodial_account_effcetive_date varchar(255) null,
custodial_accountmarket_trade_compliance_desc varchar(255) null,
custodial_accountmarket_trade_compliance_short_desc varchar(255) null,
custodial_account_decimal_positions Integer null,
custodial_accountmarket_trade_compliance_symbol varchar(255) null,
custodial_accountmarket_trade_compliance_scale varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint market_trade_compliance_pk primary key(market_trade_compliance_code));
