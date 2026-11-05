# Practice 1 – Class và Interface

Dự án dùng Java 25 và Spring Boot 4 để minh họa mối quan hệ giữa class và interface.

- `Area`: interface quy định phương thức tính diện tích.
- `Perimeter`: interface quy định phương thức tính chu vi.
- `Square` và `Rectangle`: hai class implements cả hai interface và dùng công thức riêng.

## Yêu cầu

- Docker và Docker Compose đang chạy.

Không cần cài Java hay Maven trên máy để chạy dự án bằng Docker.

## Chạy chương trình

Từ thư mục `practice1`, chạy:

```bash
docker compose up --build
```

Chương trình in diện tích và chu vi của `Square(3)` và `Rectangle(2, 3)`:

```text
Square area: 9.0
Square perimeter: 12.0
Rectangle area: 6.0
Rectangle perimeter: 10.0
```
