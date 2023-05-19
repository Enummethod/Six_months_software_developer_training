# 23. Ödev - Macera Oyunu

# Macera Oyunu 

Java'da metin tabanlı bir macera oyunu yazmak.

## Oyunun Amacı
Oyuncunun hayatta kalabilmesi için gereken malzemelerin toplanması.

## Oyuncunun Yapabilecekleri
- Oyuncu statülerine göre bir karekter seçer.
- Bölgede ki canavarlar ile savaşabilir.
- Savaştığı canavarlardan para elde edebilir.
- Bu paralar ile ekipmanlar satın alabilir.
- Oyuncu ekipman düşürebilir ve düşürdüğü ekipmanları kuşanabilir. 

### Karekterler

| Karekter  | ID  | Hasar  | Sağlık | Para  |
|:----------|:---:|:------:|:------:|:-----:|
| Samuray   |  1  |   5    |   21   |  15   |
| Okçu      |  2  |   7    |   18   |  20   |
| Şovalye   |  3  |   8    |   24   |   5   |


### Canavarlar

| Canavar  | ID  | Hasar  | Hayat  |    Ödül     |
|:---------|:---:|:------:|:------:|:-----------:|
| Zombi    |  1  |   3    |   10   |    4 Lira   |
| Vampir   |  2  |   4    |   14   |    7 Lira   |
| Ayı      |  3  |   7    |   20   |    12 Lira  |
| Yılan    |  4  |  3-6   |   12   |    Ekipman  |


### SİLAHLAR

| Silah   | ID  | Hasar  | Ücret |
|:--------|:---:|:------:|:-----:|
| Tabanca |  1  |   2    |  25   |
| Kılıç   |  2  |   3    |  35   |
| Tüfek   |  3  |   7    |  45   |

### Zırhlar

| Zırh       | ID  | Bloklama | Ücret |
|:-----------|:---:|:-------: |:-----:|
| Deri Zırh  |  1  |   1      |  15   |
| Demir Zırh |  2  |   3      |  25   |
| Çelik Zırh |  3  |   5      |  40   |


## **Bölgeler**

### Güvenli Ev

- Kazanım : Hayat Yenilenmesi

### Mağara

- Canavar : Zombi(1-3 adet)
- Özellik : Savaş + Ganimet
- Malzeme : Yiyecek

### Orman

- Canavar : Vampir(1-3 adet)
- Özellik : Savaş + Ganimet
- Malzeme : Ateş

### Nehir

- Canavar : Ayı (1-3)
- Özellik : Savaş + Ganimet
- Malzeme : Su

### Maden

- Canavar : Yılan (1-5)
- Özellik : Savaş + Ganimet
- Ganimet : Rasgele
1. Para   (25%) 
   1. 10 Lira    (20%)
   2. 5  Lira    (30%)
   3. 1  Lira    (50%)
2. Silah  (15%)
   1. Tabanca    (20%)
   2. Kılıç      (30%)
   3. Tüfek      (50%) 
3. Zırh  (15%)
   1. Deri Zırh  (20%)
   2. Demir Zırh (30%)
   3. Çelik Zırh (50%)
4. Hiçbirşey     (45%) 
### Eşya Dükkanı

- Özellik   : Ekipman Satın Alımı
- Silahlar  : Tabanca , Kılıç , Tüfek
- Zırhlar   : Deri , Demir, Çelik

### UML Diagramı

